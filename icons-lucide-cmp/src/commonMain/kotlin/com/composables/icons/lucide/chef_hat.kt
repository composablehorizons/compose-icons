package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChefHat: ImageVector
    get() {
        if (_ChefHat != null) return _ChefHat!!
        
        _ChefHat = ImageVector.Builder(
            name = "chef-hat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 21f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-5.35f)
                curveToRelative(0f, -0.457f, 0.316f, -0.844f, 0.727f, -1.041f)
                arcToRelative(4f, 4f, 0f, false, false, -2.134f, -7.589f)
                arcToRelative(5f, 5f, 0f, false, false, -9.186f, 0f)
                arcToRelative(4f, 4f, 0f, false, false, -2.134f, 7.588f)
                curveToRelative(0.411f, 0.198f, 0.727f, 0.585f, 0.727f, 1.041f)
                verticalLineTo(20f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 17f)
                horizontalLineToRelative(12f)
            }
        }.build()
        
        return _ChefHat!!
    }

private var _ChefHat: ImageVector? = null

