package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Trending_flat: ImageVector
    get() {
        if (_Trending_flat != null) return _Trending_flat!!
        
        _Trending_flat = ImageVector.Builder(
            name = "trending_flat",
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
                moveTo(22f, 12f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(3f)
                lineToRelative(4f, -4f)
                close()
            }
        }.build()
        
        return _Trending_flat!!
    }

private var _Trending_flat: ImageVector? = null

