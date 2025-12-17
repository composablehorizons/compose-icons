package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChefHat: ImageVector
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
                moveTo(12f, 3f)
                curveToRelative(1.918f, 0f, 3.52f, 1.35f, 3.91f, 3.151f)
                arcToRelative(4f, 4f, 0f, false, true, 2.09f, 7.723f)
                lineToRelative(0f, 7.126f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-7.126f)
                arcToRelative(4f, 4f, 0f, true, true, 2.092f, -7.723f)
                arcToRelative(4f, 4f, 0f, false, true, 3.908f, -3.151f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.161f, 17.009f)
                lineToRelative(11.839f, -0.009f)
            }
        }.build()
        
        return _ChefHat!!
    }

private var _ChefHat: ImageVector? = null

