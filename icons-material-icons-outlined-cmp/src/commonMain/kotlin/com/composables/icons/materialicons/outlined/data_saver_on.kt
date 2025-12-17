package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Data_saver_on: ImageVector
    get() {
        if (_Data_saver_on != null) return _Data_saver_on!!
        
        _Data_saver_on = ImageVector.Builder(
            name = "data_saver_on",
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
                        moveTo(11f, 8f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(8f)
                        horizontalLineTo(11f)
                        close()
                        moveTo(13f, 2.05f)
                        verticalLineToRelative(3.03f)
                        curveToRelative(3.39f, 0.49f, 6f, 3.39f, 6f, 6.92f)
                        curveToRelative(0f, 0.9f, -0.18f, 1.75f, -0.48f, 2.54f)
                        lineToRelative(2.6f, 1.53f)
                        curveTo(21.68f, 14.83f, 22f, 13.45f, 22f, 12f)
                        curveTo(22f, 6.82f, 18.05f, 2.55f, 13f, 2.05f)
                        close()
                        moveTo(12f, 19f)
                        curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                        curveToRelative(0f, -3.53f, 2.61f, -6.43f, 6f, -6.92f)
                        verticalLineTo(2.05f)
                        curveTo(5.94f, 2.55f, 2f, 6.81f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.47f, 10f, 9.99f, 10f)
                        curveToRelative(3.31f, 0f, 6.24f, -1.61f, 8.06f, -4.09f)
                        lineToRelative(-2.6f, -1.53f)
                        curveTo(16.17f, 17.98f, 14.21f, 19f, 12f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Data_saver_on!!
    }

private var _Data_saver_on: ImageVector? = null

