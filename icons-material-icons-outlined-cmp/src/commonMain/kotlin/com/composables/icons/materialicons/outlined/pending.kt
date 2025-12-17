package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Pending: ImageVector
    get() {
        if (_Pending != null) return _Pending!!
        
        _Pending = ImageVector.Builder(
            name = "pending",
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
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                        curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                        curveTo(20f, 16.42f, 16.42f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.5f, 12f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 7f, 13.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 12f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.5f, 12f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 12f, 13.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 12f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.5f, 12f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 17f, 13.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 12f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 18.5f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Pending!!
    }

private var _Pending: ImageVector? = null

