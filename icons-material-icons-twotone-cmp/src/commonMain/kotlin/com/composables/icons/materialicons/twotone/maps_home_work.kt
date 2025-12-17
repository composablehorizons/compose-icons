package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Maps_home_work: ImageVector
    get() {
        if (_Maps_home_work != null) return _Maps_home_work!!
        
        _Maps_home_work = ImageVector.Builder(
            name = "maps_home_work",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 11f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(-9f)
                        verticalLineToRelative(1.4f)
                        lineToRelative(5f, 3.57f)
                        verticalLineTo(11f)
                        close()
                        moveTo(17f, 7f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 3f)
                        lineTo(10f, 4.97f)
                        lineTo(10.96f, 5.66f)
                        lineTo(12f, 6.4f)
                        lineTo(12f, 5f)
                        lineTo(21f, 5f)
                        lineTo(21f, 19f)
                        lineTo(17f, 19f)
                        lineTo(17f, 21f)
                        lineTo(23f, 21f)
                        lineTo(23f, 3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 12f)
                        lineTo(3f, 19f)
                        lineTo(5f, 19f)
                        lineTo(5f, 14f)
                        lineTo(11f, 14f)
                        lineTo(11f, 19f)
                        lineTo(13f, 19f)
                        lineTo(13f, 12f)
                        lineTo(8f, 8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 7f)
                        horizontalLineTo(19f)
                        verticalLineTo(9f)
                        horizontalLineTo(17f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 11f)
                        horizontalLineTo(19f)
                        verticalLineTo(13f)
                        horizontalLineTo(17f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 15f)
                        horizontalLineTo(19f)
                        verticalLineTo(17f)
                        horizontalLineTo(17f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1f, 11f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(11f)
                        lineTo(8f, 6f)
                        lineTo(1f, 11f)
                        close()
                        moveTo(13f, 19f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-5f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(-7f)
                        lineToRelative(5f, -3.5f)
                        lineToRelative(5f, 3.5f)
                        verticalLineTo(19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Maps_home_work!!
    }

private var _Maps_home_work: ImageVector? = null

