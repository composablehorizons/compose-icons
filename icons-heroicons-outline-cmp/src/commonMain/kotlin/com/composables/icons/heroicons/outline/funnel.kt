package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Funnel: ImageVector
    get() {
        if (_Funnel != null) return _Funnel!!
        
        _Funnel = ImageVector.Builder(
            name = "funnel",
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
                moveTo(12f, 3f)
                curveToRelative(2.755f, 0f, 5.455f, 0.232f, 8.083f, 0.678f)
                curveToRelative(0.533f, 0.09f, 0.917f, 0.556f, 0.917f, 1.096f)
                verticalLineToRelative(1.044f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -0.659f, 1.591f)
                lineToRelative(-5.432f, 5.432f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -0.659f, 1.591f)
                verticalLineToRelative(2.927f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.244f, 2.013f)
                lineTo(9.75f, 21f)
                verticalLineToRelative(-6.568f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -0.659f, -1.591f)
                lineTo(3.659f, 7.409f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3f, 5.818f)
                verticalLineTo(4.774f)
                curveToRelative(0f, -0.54f, 0.384f, -1.006f, 0.917f, -1.096f)
                arcTo(48.32f, 48.32f, 0f, false, true, 12f, 3f)
                close()
            }
        }.build()
        
        return _Funnel!!
    }

private var _Funnel: ImageVector? = null

