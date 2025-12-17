package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.DevicePhoneMobile: ImageVector
    get() {
        if (_DevicePhoneMobile != null) return _DevicePhoneMobile!!
        
        _DevicePhoneMobile = ImageVector.Builder(
            name = "device-phone-mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(10.5f, 1.5f)
                horizontalLineTo(8.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 6f, 3.75f)
                verticalLineToRelative(16.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(7.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 20.25f)
                verticalLineTo(3.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineTo(13.5f)
                moveToRelative(-3f, 0f)
                verticalLineTo(3f)
                horizontalLineToRelative(3f)
                verticalLineTo(1.5f)
                moveToRelative(-3f, 0f)
                horizontalLineToRelative(3f)
                moveToRelative(-3f, 18.75f)
                horizontalLineToRelative(3f)
            }
        }.build()
        
        return _DevicePhoneMobile!!
    }

private var _DevicePhoneMobile: ImageVector? = null

