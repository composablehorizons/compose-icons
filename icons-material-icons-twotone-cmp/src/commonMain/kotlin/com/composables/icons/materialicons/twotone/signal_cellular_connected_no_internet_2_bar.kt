package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_cellular_connected_no_internet_2_bar: ImageVector
    get() {
        if (_Signal_cellular_connected_no_internet_2_bar != null) return _Signal_cellular_connected_no_internet_2_bar!!
        
        _Signal_cellular_connected_no_internet_2_bar = ImageVector.Builder(
            name = "signal_cellular_connected_no_internet_2_bar",
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
                moveTo(22f, 8f)
                verticalLineTo(2f)
                lineTo(2f, 22f)
                horizontalLineToRelative(16f)
                verticalLineTo(8f)
                horizontalLineToRelative(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 22f)
                verticalLineTo(10f)
                lineTo(2f, 22f)
                horizontalLineToRelative(12f)
                close()
                moveToRelative(6f, -12f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(0f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Signal_cellular_connected_no_internet_2_bar!!
    }

private var _Signal_cellular_connected_no_internet_2_bar: ImageVector? = null

