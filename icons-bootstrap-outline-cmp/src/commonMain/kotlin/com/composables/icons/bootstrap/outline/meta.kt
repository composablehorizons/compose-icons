package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Meta: ImageVector
    get() {
        if (_Meta != null) return _Meta!!
        
        _Meta = ImageVector.Builder(
            name = "meta",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.217f, 5.243f)
                curveTo(9.145f, 3.988f, 10.171f, 3f, 11.483f, 3f)
                curveTo(13.96f, 3f, 16f, 6.153f, 16.001f, 9.907f)
                curveToRelative(0f, 2.29f, -0.986f, 3.725f, -2.757f, 3.725f)
                curveToRelative(-1.543f, 0f, -2.395f, -0.866f, -3.924f, -3.424f)
                lineToRelative(-0.667f, -1.123f)
                lineToRelative(-0.118f, -0.197f)
                arcToRelative(55f, 55f, 0f, false, false, -0.53f, -0.877f)
                lineToRelative(-1.178f, 2.08f)
                curveToRelative(-1.673f, 2.925f, -2.615f, 3.541f, -3.923f, 3.541f)
                curveTo(1.086f, 13.632f, 0f, 12.217f, 0f, 9.973f)
                curveTo(0f, 6.388f, 1.995f, 3f, 4.598f, 3f)
                quadToRelative(0.477f, -0.001f, 0.924f, 0.122f)
                curveToRelative(0.31f, 0.086f, 0.611f, 0.22f, 0.913f, 0.407f)
                curveToRelative(0.577f, 0.359f, 1.154f, 0.915f, 1.782f, 1.714f)
                moveToRelative(1.516f, 2.224f)
                quadToRelative(-0.378f, -0.615f, -0.727f, -1.133f)
                lineTo(9f, 6.326f)
                curveToRelative(0.845f, -1.305f, 1.543f, -1.954f, 2.372f, -1.954f)
                curveToRelative(1.723f, 0f, 3.102f, 2.537f, 3.102f, 5.653f)
                curveToRelative(0f, 1.188f, -0.39f, 1.877f, -1.195f, 1.877f)
                curveToRelative(-0.773f, 0f, -1.142f, -0.51f, -2.61f, -2.87f)
                close()
                moveTo(4.846f, 4.756f)
                curveToRelative(0.725f, 0.1f, 1.385f, 0.634f, 2.34f, 2.001f)
                arcTo(212f, 212f, 0f, false, false, 5.551f, 9.3f)
                curveToRelative(-1.357f, 2.126f, -1.826f, 2.603f, -2.581f, 2.603f)
                curveToRelative(-0.777f, 0f, -1.24f, -0.682f, -1.24f, -1.9f)
                curveToRelative(0f, -2.602f, 1.298f, -5.264f, 2.846f, -5.264f)
                quadToRelative(0.137f, 0f, 0.27f, 0.018f)
            }
        }.build()
        
        return _Meta!!
    }

private var _Meta: ImageVector? = null

