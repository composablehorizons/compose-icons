package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TagOff: ImageVector
    get() {
        if (_TagOff != null) return _TagOff!!
        
        _TagOff = ImageVector.Builder(
            name = "tag-off",
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
                moveTo(7.149f, 7.144f)
                arcToRelative(0.498f, 0.498f, 0f, false, false, 0.351f, 0.856f)
                arcToRelative(0.498f, 0.498f, 0f, false, false, 0.341f, -0.135f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.883f, 3.875f)
                arcToRelative(2.99f, 2.99f, 0f, false, false, -0.883f, 2.125f)
                verticalLineToRelative(5.172f)
                arcToRelative(2f, 2f, 0f, false, false, 0.586f, 1.414f)
                lineToRelative(7.71f, 7.71f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 3.408f, 0f)
                lineToRelative(2.796f, -2.796f)
                moveToRelative(2.005f, -2.005f)
                lineToRelative(0.79f, -0.79f)
                arcToRelative(2.41f, 2.41f, 0f, false, false, 0f, -3.41f)
                lineToRelative(-7.71f, -7.71f)
                arcToRelative(2f, 2f, 0f, false, false, -1.412f, -0.585f)
                horizontalLineToRelative(-4.173f)
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
        
        return _TagOff!!
    }

private var _TagOff: ImageVector? = null

