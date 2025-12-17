package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Trending_down: ImageVector
    get() {
        if (_Trending_down != null) return _Trending_down!!
        
        _Trending_down = ImageVector.Builder(
            name = "trending_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.85f, 17.15f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(-4.88f, -4.88f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-6f, -6.01f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineTo(9.41f, 12f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(5.59f, 5.58f)
                lineToRelative(1.44f, -1.44f)
                curveToRelative(0.31f, -0.31f, 0.85f, -0.09f, 0.85f, 0.35f)
                verticalLineToRelative(4.29f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(17.2f)
                curveToRelative(-0.44f, 0.01f, -0.66f, -0.53f, -0.35f, -0.84f)
                close()
            }
        }.build()
        
        return _Trending_down!!
    }

private var _Trending_down: ImageVector? = null

