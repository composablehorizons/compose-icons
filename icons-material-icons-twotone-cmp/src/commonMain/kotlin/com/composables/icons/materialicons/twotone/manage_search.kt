package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Manage_search: ImageVector
    get() {
        if (_Manage_search != null) return _Manage_search!!
        
        _Manage_search = ImageVector.Builder(
            name = "manage_search",
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
                        moveTo(2f, 12f)
                        horizontalLineTo(7f)
                        verticalLineTo(14f)
                        horizontalLineTo(2f)
                        verticalLineTo(12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.17f, 13.75f)
                        curveTo(18.69f, 12.96f, 19f, 12.02f, 19f, 11f)
                        curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                        reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                        reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                        curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.76f, -0.83f)
                        lineTo(20.59f, 19f)
                        lineTo(22f, 17.59f)
                        lineTo(18.17f, 13.75f)
                        close()
                        moveTo(14f, 14f)
                        curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                        curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                        reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                        curveTo(17f, 12.65f, 15.65f, 14f, 14f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 7f)
                        horizontalLineTo(7f)
                        verticalLineTo(9f)
                        horizontalLineTo(2f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 17f)
                        horizontalLineTo(12f)
                        verticalLineTo(19f)
                        horizontalLineTo(2f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Manage_search!!
    }

private var _Manage_search: ImageVector? = null

