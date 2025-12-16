package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Desktop: ImageVector
    get() {
        if (_Desktop != null) return _Desktop!!
        
        _Desktop = ImageVector.Builder(
            name = "desktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.8779f, 2.00684f)
                curveTo(14.5082f, 2.07092f, 15f, 2.60285f, 15f, 3.25f)
                verticalLineTo(10.75f)
                curveTo(15f, 11.4404f, 14.4404f, 12f, 13.75f, 12f)
                horizontalLineTo(9.92676f)
                lineTo(10.1699f, 13.2988f)
                lineTo(10.1797f, 13.4238f)
                curveTo(10.1678f, 13.7104f, 9.93104f, 13.95f, 9.62988f, 13.9502f)
                horizontalLineTo(5.37012f)
                curveTo(5.02598f, 13.95f, 4.76674f, 13.6371f, 4.83008f, 13.2988f)
                lineTo(5.07324f, 12f)
                horizontalLineTo(1.25f)
                curveTo(0.559644f, 12f, 2.14752E-8f, 11.4404f, 0f, 10.75f)
                verticalLineTo(3.25f)
                curveTo(1.34221E-9f, 2.55964f, 0.559644f, 2f, 1.25f, 2f)
                horizontalLineTo(13.75f)
                lineTo(13.8779f, 2.00684f)
                close()
                moveTo(5.98926f, 12f)
                lineTo(5.79297f, 13.0498f)
                horizontalLineTo(9.20703f)
                lineTo(9.01074f, 12f)
                horizontalLineTo(5.98926f)
                close()
                moveTo(1.25f, 3f)
                curveTo(1.11193f, 3f, 1f, 3.11193f, 1f, 3.25f)
                verticalLineTo(10.75f)
                curveTo(1f, 10.8881f, 1.11193f, 11f, 1.25f, 11f)
                horizontalLineTo(13.75f)
                curveTo(13.8881f, 11f, 14f, 10.8881f, 14f, 10.75f)
                verticalLineTo(3.25f)
                curveTo(14f, 3.12931f, 13.9145f, 3.02833f, 13.8008f, 3.00488f)
                lineTo(13.75f, 3f)
                horizontalLineTo(1.25f)
                close()
            }
        }.build()
        
        return _Desktop!!
    }

private var _Desktop: ImageVector? = null

