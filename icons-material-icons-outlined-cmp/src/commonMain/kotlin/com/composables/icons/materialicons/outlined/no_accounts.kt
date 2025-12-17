package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.No_accounts: ImageVector
    get() {
        if (_No_accounts != null) return _No_accounts!!
        
        _No_accounts = ImageVector.Builder(
            name = "no_accounts",
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
                        moveTo(15.18f, 10.94f)
                        curveToRelative(0.2f, -0.44f, 0.32f, -0.92f, 0.32f, -1.44f)
                        curveTo(15.5f, 7.57f, 13.93f, 6f, 12f, 6f)
                        curveToRelative(-0.52f, 0f, -1f, 0.12f, -1.44f, 0.32f)
                        lineTo(15.18f, 10.94f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(4f, 12f)
                        curveToRelative(0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f)
                        lineToRelative(2.86f, 2.86f)
                        curveToRelative(0.21f, 1.56f, 1.43f, 2.79f, 2.99f, 2.99f)
                        lineToRelative(2.2f, 2.2f)
                        curveTo(13.17f, 15.05f, 12.59f, 15f, 12f, 15f)
                        curveToRelative(-2.32f, 0f, -4.45f, 0.8f, -6.14f, 2.12f)
                        curveTo(4.7f, 15.73f, 4f, 13.95f, 4f, 12f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-1.74f, 0f, -3.34f, -0.56f, -4.65f, -1.5f)
                        curveTo(8.66f, 17.56f, 10.26f, 17f, 12f, 17f)
                        reflectiveCurveToRelative(3.34f, 0.56f, 4.65f, 1.5f)
                        curveTo(15.34f, 19.44f, 13.74f, 20f, 12f, 20f)
                        close()
                        moveTo(18.31f, 16.9f)
                        lineTo(7.1f, 5.69f)
                        curveTo(8.45f, 4.63f, 10.15f, 4f, 12f, 4f)
                        curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                        curveTo(20f, 13.85f, 19.37f, 15.54f, 18.31f, 16.9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _No_accounts!!
    }

private var _No_accounts: ImageVector? = null

