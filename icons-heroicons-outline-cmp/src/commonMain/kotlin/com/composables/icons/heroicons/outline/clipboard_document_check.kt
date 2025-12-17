package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ClipboardDocumentCheck: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(11.35f, 3.836f)
                curveToRelative(-0.065f, 0.21f, -0.1f, 0.433f, -0.1f, 0.664f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -0.1f, -0.664f)
                moveToRelative(-5.8f, 0f)
                arcTo(2.251f, 2.251f, 0f, false, true, 13.5f, 2.25f)
                horizontalLineTo(15f)
                curveToRelative(1.012f, 0f, 1.867f, 0.668f, 2.15f, 1.586f)
                moveToRelative(-5.8f, 0f)
                curveToRelative(-0.376f, 0.023f, -0.75f, 0.05f, -1.124f, 0.08f)
                curveTo(9.095f, 4.01f, 8.25f, 4.973f, 8.25f, 6.108f)
                verticalLineTo(8.25f)
                moveToRelative(8.9f, -4.414f)
                curveToRelative(0.376f, 0.023f, 0.75f, 0.05f, 1.124f, 0.08f)
                curveToRelative(1.131f, 0.094f, 1.976f, 1.057f, 1.976f, 2.192f)
                verticalLineTo(16.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 18.75f)
                horizontalLineToRelative(-2.25f)
                moveToRelative(-7.5f, -10.5f)
                horizontalLineTo(4.875f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(18.75f)
                moveToRelative(-7.5f, -10.5f)
                horizontalLineToRelative(6.375f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(9.375f)
                moveToRelative(-8.25f, -3f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(3f, -3.75f)
            }
        }.build()
        
        return _ClipboardDocumentCheck!!
    }

private var _ClipboardDocumentCheck: ImageVector? = null

