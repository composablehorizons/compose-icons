package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ClipboardDocumentList: ImageVector
    get() {
        if (_ClipboardDocumentList != null) return _ClipboardDocumentList!!
        
        _ClipboardDocumentList = ImageVector.Builder(
            name = "clipboard-document-list",
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
                moveTo(9f, 12f)
                horizontalLineToRelative(3.75f)
                moveTo(9f, 15f)
                horizontalLineToRelative(3.75f)
                moveTo(9f, 18f)
                horizontalLineToRelative(3.75f)
                moveToRelative(3f, 0.75f)
                horizontalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineTo(6.108f)
                curveToRelative(0f, -1.135f, -0.845f, -2.098f, -1.976f, -2.192f)
                arcToRelative(48.424f, 48.424f, 0f, false, false, -1.123f, -0.08f)
                moveToRelative(-5.801f, 0f)
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
                moveToRelative(0f, 0f)
                horizontalLineTo(4.875f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(9.375f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineTo(8.25f)
                close()
                moveTo(6.75f, 12f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(6.75f)
                verticalLineTo(12f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(6.75f)
                verticalLineTo(15f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(6.75f)
                verticalLineTo(18f)
                close()
            }
        }.build()
        
        return _ClipboardDocumentList!!
    }

private var _ClipboardDocumentList: ImageVector? = null

