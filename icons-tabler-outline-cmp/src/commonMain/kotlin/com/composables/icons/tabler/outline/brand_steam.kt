package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSteam: ImageVector
    get() {
        if (_BrandSteam != null) return _BrandSteam!!
        
        _BrandSteam = ImageVector.Builder(
            name = "brand-steam",
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
                moveTo(16.5f, 5f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, -0.653f, 8.953f)
                lineToRelative(-4.347f, 3.009f)
                lineToRelative(0f, 0.038f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 3f)
                lineToRelative(-0.176f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, -2.94f, -2.402f)
                lineToRelative(-2.56f, -1.098f)
                verticalLineToRelative(-3.5f)
                lineToRelative(3.51f, 1.755f)
                arcToRelative(2.989f, 2.989f, 0f, false, true, 2.834f, -0.635f)
                lineToRelative(2.727f, -3.818f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 4.429f, -5.302f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 9.5f)
                arcTo(1f, 1f, 0f, false, true, 16.5f, 10.5f)
                arcTo(1f, 1f, 0f, false, true, 15.5f, 9.5f)
                arcTo(1f, 1f, 0f, false, true, 17.5f, 9.5f)
                close()
            }
        }.build()
        
        return _BrandSteam!!
    }

private var _BrandSteam: ImageVector? = null

