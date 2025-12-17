package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ClipboardDocumentCheck: ImageVector
    get() {
        if (_ClipboardDocumentCheck != null) return _ClipboardDocumentCheck!!
        
        _ClipboardDocumentCheck = ImageVector.Builder(
            name = "clipboard-document-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.502f, 6f)
                horizontalLineToRelative(7.128f)
                arcTo(3.375f, 3.375f, 0f, false, true, 18f, 9.375f)
                verticalLineToRelative(9.375f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(6.108f)
                curveToRelative(0f, -1.505f, -1.125f, -2.811f, -2.664f, -2.94f)
                arcToRelative(48.972f, 48.972f, 0f, false, false, -0.673f, -0.05f)
                arcTo(3f, 3f, 0f, false, false, 15f, 1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(3f, 3f, 0f, false, false, -2.663f, 1.618f)
                curveToRelative(-0.225f, 0.015f, -0.45f, 0.032f, -0.673f, 0.05f)
                curveTo(8.662f, 3.295f, 7.554f, 4.542f, 7.502f, 6f)
                close()
                moveTo(13.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12f, 4.5f)
                horizontalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 15f, 3f)
                horizontalLineToRelative(-1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 9.375f)
                curveTo(3f, 8.339f, 3.84f, 7.5f, 4.875f, 7.5f)
                horizontalLineToRelative(9.75f)
                curveToRelative(1.036f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineToRelative(-9.75f)
                arcTo(1.875f, 1.875f, 0f, false, true, 3f, 20.625f)
                verticalLineTo(9.375f)
                close()
                moveToRelative(9.586f, 4.594f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.172f, -0.938f)
                lineToRelative(-2.476f, 3.096f)
                lineToRelative(-0.908f, -0.907f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.116f, -0.062f)
                lineToRelative(3f, -3.75f)
                close()
            }
        }.build()
        
        return _ClipboardDocumentCheck!!
    }

private var _ClipboardDocumentCheck: ImageVector? = null

