package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChartFunnel: ImageVector
    get() {
        if (_ChartFunnel != null) return _ChartFunnel!!
        
        _ChartFunnel = ImageVector.Builder(
            name = "chart-funnel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.72f, 16f)
                lineToRelative(-1.315f, 3.948f)
                arcToRelative(3f, 3f, 0f, false, true, -2.847f, 2.052f)
                horizontalLineToRelative(-3.116f)
                arcToRelative(3f, 3f, 0f, false, true, -2.847f, -2.052f)
                lineToRelative(-1.315f, -3.948f)
                close()
                moveToRelative(2f, -6f)
                lineToRelative(-1.333f, 4f)
                horizontalLineToRelative(-12.774f)
                lineToRelative(-1.333f, -4f)
                close()
                moveToRelative(-0.106f, -8f)
                arcToRelative(2f, 2f, 0f, false, true, 1.896f, 2.632f)
                lineToRelative(-1.123f, 3.368f)
                horizontalLineToRelative(-16.774f)
                lineToRelative(-1.123f, -3.368f)
                arcToRelative(2f, 2f, 0f, false, true, 1.72f, -2.624f)
                lineToRelative(0.177f, -0.008f)
                close()
            }
        }.build()
        
        return _ChartFunnel!!
    }

private var _ChartFunnel: ImageVector? = null

