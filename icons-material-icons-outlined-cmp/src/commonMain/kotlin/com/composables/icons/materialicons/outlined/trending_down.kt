package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Trending_down: ImageVector
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
                moveTo(16f, 18f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-4.88f, -4.88f)
                lineToRelative(-4f, 4f)
                lineTo(2f, 7.41f)
                lineTo(3.41f, 6f)
                lineToRelative(6f, 6f)
                lineToRelative(4f, -4f)
                lineToRelative(6.3f, 6.29f)
                lineTo(22f, 12f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.build()
        
        return _Trending_down!!
    }

private var _Trending_down: ImageVector? = null

