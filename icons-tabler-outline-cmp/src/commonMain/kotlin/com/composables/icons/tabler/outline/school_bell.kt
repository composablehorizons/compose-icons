package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SchoolBell: ImageVector
    get() {
        if (_SchoolBell != null) return _SchoolBell!!
        
        _SchoolBell = ImageVector.Builder(
            name = "school-bell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 17f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.805f, 6.37f)
                lineToRelative(2.783f, -2.784f)
                arcToRelative(2f, 2f, 0f, true, true, 2.829f, 2.828f)
                lineToRelative(-2.784f, 2.786f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.505f, 7.495f)
                arcToRelative(5.105f, 5.105f, 0f, false, true, 0.176f, 7.035f)
                lineToRelative(-0.176f, 0.184f)
                lineToRelative(-1.867f, 1.867f)
                arcToRelative(3.48f, 3.48f, 0f, false, false, -1.013f, 2.234f)
                lineToRelative(-0.008f, 0.23f)
                verticalLineToRelative(0.934f)
                curveToRelative(0f, 0.327f, -0.13f, 0.64f, -0.36f, 0.871f)
                arcToRelative(0.51f, 0.51f, 0f, false, true, -0.652f, 0.06f)
                lineToRelative(-0.07f, -0.06f)
                lineToRelative(-9.385f, -9.384f)
                arcToRelative(0.51f, 0.51f, 0f, false, true, 0f, -0.722f)
                curveToRelative(0.198f, -0.198f, 0.456f, -0.322f, 0.732f, -0.353f)
                lineToRelative(0.139f, -0.008f)
                horizontalLineToRelative(0.933f)
                curveToRelative(0.848f, 0f, 1.663f, -0.309f, 2.297f, -0.864f)
                lineToRelative(0.168f, -0.157f)
                lineToRelative(1.867f, -1.867f)
                lineToRelative(0.16f, -0.153f)
                arcToRelative(5.105f, 5.105f, 0f, false, true, 7.059f, 0.153f)
                close()
            }
        }.build()
        
        return _SchoolBell!!
    }

private var _SchoolBell: ImageVector? = null

