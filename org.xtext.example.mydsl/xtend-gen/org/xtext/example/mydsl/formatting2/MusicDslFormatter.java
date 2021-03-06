/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import musicMetamodel.Clef;
import musicMetamodel.Composition;
import musicMetamodel.Key;
import musicMetamodel.Staff;
import musicMetamodel.StaffElement;
import musicMetamodel.TimeSignature;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.services.MusicDslGrammarAccess;

@SuppressWarnings("all")
public class MusicDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MusicDslGrammarAccess _musicDslGrammarAccess;
  
  protected void _format(final Composition composition, @Extension final IFormattableDocument document) {
    EList<Staff> _staff = composition.getStaff();
    for (final Staff staff : _staff) {
      document.<Staff>format(staff);
    }
  }
  
  protected void _format(final Staff staff, @Extension final IFormattableDocument document) {
    document.<Clef>format(staff.getClef());
    document.<TimeSignature>format(staff.getTime());
    EList<StaffElement> _elements = staff.getElements();
    for (final StaffElement staffElement : _elements) {
      document.<StaffElement>format(staffElement);
    }
    document.<Key>format(staff.getKey());
  }
  
  public void format(final Object composition, final IFormattableDocument document) {
    if (composition instanceof XtextResource) {
      _format((XtextResource)composition, document);
      return;
    } else if (composition instanceof Composition) {
      _format((Composition)composition, document);
      return;
    } else if (composition instanceof Staff) {
      _format((Staff)composition, document);
      return;
    } else if (composition instanceof EObject) {
      _format((EObject)composition, document);
      return;
    } else if (composition == null) {
      _format((Void)null, document);
      return;
    } else if (composition != null) {
      _format(composition, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(composition, document).toString());
    }
  }
}
