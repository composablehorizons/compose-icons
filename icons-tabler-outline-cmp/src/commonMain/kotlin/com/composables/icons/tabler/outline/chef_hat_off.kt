package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ChefHatOff: ImageVector
    get() {
        if (_ChefHatOff != null) return _ChefHatOff!!
        
        _ChefHatOff = ImageVector.Builder(
            name = "chef-hat-off",
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
                moveTo(8.72f, 4.712f)
                arcToRelative(4f, 4f, 0f, false, true, 7.19f, 1.439f)
                arcToRelative(4f, 4f, 0f, false, true, 2.09f, 7.723f)
                verticalLineToRelative(0.126f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-7.126f)
                arcToRelative(4f, 4f, 0f, false, true, 0.081f, -7.796f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.161f, 17.009f)
                lineToRelative(10.839f, -0.009f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _ChefHatOff!!
    }

private var _ChefHatOff: ImageVector? = null

