package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Signal_cellular_connected_no_internet_0_bar: ImageVector
    get() {
        if (_Signal_cellular_connected_no_internet_0_bar != null) return _Signal_cellular_connected_no_internet_0_bar!!
        
        _Signal_cellular_connected_no_internet_0_bar = ImageVector.Builder(
            name = "signal_cellular_connected_no_internet_0_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                verticalLineTo(18f)
                close()
                moveTo(20f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(22f)
                close()
                moveTo(18f, 20f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                lineTo(22f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6.83f)
                lineTo(6.83f, 20f)
                horizontalLineTo(18f)
                close()
            }
        }.build()
        
        return _Signal_cellular_connected_no_internet_0_bar!!
    }

private var _Signal_cellular_connected_no_internet_0_bar: ImageVector? = null

