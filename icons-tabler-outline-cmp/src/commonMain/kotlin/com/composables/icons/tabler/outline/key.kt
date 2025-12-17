package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
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
                moveTo(16.555f, 3.843f)
                lineToRelative(3.602f, 3.602f)
                arcToRelative(2.877f, 2.877f, 0f, false, true, 0f, 4.069f)
                lineToRelative(-2.643f, 2.643f)
                arcToRelative(2.877f, 2.877f, 0f, false, true, -4.069f, 0f)
                lineToRelative(-0.301f, -0.301f)
                lineToRelative(-6.558f, 6.558f)
                arcToRelative(2f, 2f, 0f, false, true, -1.239f, 0.578f)
                lineToRelative(-0.175f, 0.008f)
                horizontalLineToRelative(-1.172f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-1.172f)
                arcToRelative(2f, 2f, 0f, false, true, 0.467f, -1.284f)
                lineToRelative(0.119f, -0.13f)
                lineToRelative(0.414f, -0.414f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                lineToRelative(2.144f, -2.144f)
                lineToRelative(-0.301f, -0.301f)
                arcToRelative(2.877f, 2.877f, 0f, false, true, 0f, -4.069f)
                lineToRelative(2.643f, -2.643f)
                arcToRelative(2.877f, 2.877f, 0f, false, true, 4.069f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

