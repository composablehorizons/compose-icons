package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DevicePhoneMobile: ImageVector
    get() {
        if (_DevicePhoneMobile != null) return _DevicePhoneMobile!!
        
        _DevicePhoneMobile = ImageVector.Builder(
            name = "device-phone-mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 4f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(7f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(4f)
                close()
                moveToRelative(4f, -1.5f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(2.5f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14.5f, 4f)
                verticalLineToRelative(12f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 16f)
                verticalLineTo(4f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 2.5f)
                horizontalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _DevicePhoneMobile!!
    }

private var _DevicePhoneMobile: ImageVector? = null

