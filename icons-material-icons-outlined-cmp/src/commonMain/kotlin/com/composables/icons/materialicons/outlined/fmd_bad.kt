package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Fmd_bad: ImageVector
    get() {
        if (_Fmd_bad != null) return _Fmd_bad!!
        
        _Fmd_bad = ImageVector.Builder(
            name = "fmd_bad",
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
                        moveTo(12f, 2f)
                        curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                        curveToRelative(0f, 3.32f, 2.67f, 7.25f, 8f, 11.8f)
                        curveToRelative(5.33f, -4.55f, 8f, -8.48f, 8f, -11.8f)
                        curveTo(20f, 5.22f, 16.2f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 19.33f)
                        curveToRelative(-4.05f, -3.7f, -6f, -6.79f, -6f, -9.14f)
                        curveTo(6f, 6.57f, 8.65f, 4f, 12f, 4f)
                        reflectiveCurveToRelative(6f, 2.57f, 6f, 6.2f)
                        curveTo(18f, 12.54f, 16.05f, 15.64f, 12f, 19.33f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 6f)
                        horizontalLineTo(13f)
                        verticalLineTo(11f)
                        horizontalLineTo(11f)
                        verticalLineTo(6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 13f)
                        horizontalLineTo(13f)
                        verticalLineTo(15f)
                        horizontalLineTo(11f)
                        verticalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Fmd_bad!!
    }

private var _Fmd_bad: ImageVector? = null

