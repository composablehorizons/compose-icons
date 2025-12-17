package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.DeviceTablet: ImageVector
    get() {
        if (_DeviceTablet != null) return _DeviceTablet!!
        
        _DeviceTablet = ImageVector.Builder(
            name = "device-tablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(10.5f, 19.5f)
                horizontalLineToRelative(3f)
                moveToRelative(-6.75f, 2.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineToRelative(-15f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineTo(6.75f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.5f, 4.5f)
                verticalLineToRelative(15f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                close()
            }
        }.build()
        
        return _DeviceTablet!!
    }

private var _DeviceTablet: ImageVector? = null

