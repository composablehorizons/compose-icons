package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ClipboardDocument: ImageVector
    get() {
        if (_ClipboardDocument != null) return _ClipboardDocument!!
        
        _ClipboardDocument = ImageVector.Builder(
            name = "clipboard-document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(8.25f, 7.5f)
                verticalLineTo(6.108f)
                curveToRelative(0f, -1.135f, 0.845f, -2.098f, 1.976f, -2.192f)
                curveToRelative(0.373f, -0.03f, 0.748f, -0.057f, 1.123f, -0.08f)
                moveTo(15.75f, 18f)
                horizontalLineTo(18f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineTo(6.108f)
                curveToRelative(0f, -1.135f, -0.845f, -2.098f, -1.976f, -2.192f)
                arcToRelative(48.424f, 48.424f, 0f, false, false, -1.123f, -0.08f)
                moveTo(15.75f, 18.75f)
                verticalLineToRelative(-1.875f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, -3.375f, -3.375f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.125f, -1.125f)
                verticalLineToRelative(-1.5f)
                arcTo(3.375f, 3.375f, 0f, false, false, 6.375f, 7.5f)
                horizontalLineTo(5.25f)
                moveToRelative(11.9f, -3.664f)
                arcTo(2.251f, 2.251f, 0f, false, false, 15f, 2.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(2.251f, 2.251f, 0f, false, false, -2.15f, 1.586f)
                moveToRelative(5.8f, 0f)
                curveToRelative(0.065f, 0.21f, 0.1f, 0.433f, 0.1f, 0.664f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-6f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -0.231f, 0.035f, -0.454f, 0.1f, -0.664f)
                moveTo(6.75f, 7.5f)
                horizontalLineTo(4.875f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(16.5f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, -9f)
                close()
            }
        }.build()
        
        return _ClipboardDocument!!
    }

private var _ClipboardDocument: ImageVector? = null

