package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ExclamationTriangle: ImageVector
    get() {
        if (_ExclamationTriangle != null) return _ExclamationTriangle!!
        
        _ExclamationTriangle = ImageVector.Builder(
            name = "exclamation-triangle",
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
                moveTo(12f, 9f)
                verticalLineToRelative(3.75f)
                moveToRelative(-9.303f, 3.376f)
                curveToRelative(-0.866f, 1.5f, 0.217f, 3.374f, 1.948f, 3.374f)
                horizontalLineToRelative(14.71f)
                curveToRelative(1.73f, 0f, 2.813f, -1.874f, 1.948f, -3.374f)
                lineTo(13.949f, 3.378f)
                curveToRelative(-0.866f, -1.5f, -3.032f, -1.5f, -3.898f, 0f)
                lineTo(2.697f, 16.126f)
                close()
                moveTo(12f, 15.75f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(12f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()
        
        return _ExclamationTriangle!!
    }

private var _ExclamationTriangle: ImageVector? = null

