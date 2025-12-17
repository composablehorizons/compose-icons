package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Upcoming: ImageVector
    get() {
        if (_Upcoming != null) return _Upcoming!!
        
        _Upcoming = ImageVector.Builder(
            name = "upcoming",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
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
                        moveTo(12f, 17f)
                        curveToRelative(-2.04f, 0f, -3.81f, -1.24f, -4.58f, -3f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(-3.42f)
                        curveTo(15.81f, 15.76f, 14.04f, 17f, 12f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.16f, 7.26f)
                        lineToRelative(-1.41f, -1.41f)
                        lineTo(16.19f, 9.4f)
                        lineToRelative(1.41f, 1.41f)
                        curveTo(17.6f, 10.81f, 21.05f, 7.29f, 21.16f, 7.26f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 3f)
                        horizontalLineTo(13f)
                        verticalLineTo(8f)
                        horizontalLineTo(11f)
                        verticalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 12f)
                        horizontalLineToRelative(-5f)
                        curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                        reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                        horizontalLineTo(4f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-5f)
                        curveTo(22f, 12.9f, 21.1f, 12f, 20f, 12f)
                        close()
                        moveTo(20f, 19f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(3.42f)
                        curveToRelative(0.77f, 1.76f, 2.54f, 3f, 4.58f, 3f)
                        reflectiveCurveToRelative(3.81f, -1.24f, 4.58f, -3f)
                        horizontalLineTo(20f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6.4f, 10.81f)
                        lineTo(7.81f, 9.4f)
                        lineTo(4.26f, 5.84f)
                        lineTo(2.84f, 7.26f)
                        curveTo(2.95f, 7.29f, 6.4f, 10.81f, 6.4f, 10.81f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Upcoming!!
    }

private var _Upcoming: ImageVector? = null

