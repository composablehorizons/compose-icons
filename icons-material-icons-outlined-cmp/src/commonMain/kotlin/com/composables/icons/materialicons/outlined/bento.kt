package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Bento: ImageVector
    get() {
        if (_Bento != null) return _Bento!!
        
        _Bento = ImageVector.Builder(
            name = "bento",
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 5f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 5f, 2f, 5.9f, 2f, 7f)
                    verticalLineToRelative(10f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(7f)
                    curveTo(22f, 5.9f, 21.1f, 5f, 20f, 5f)
                    close()
                    moveTo(20f, 11f)
                    horizontalLineToRelative(-6f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(11f)
                    close()
                    moveTo(4f, 7f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(10f)
                    horizontalLineTo(4f)
                    verticalLineTo(7f)
                    close()
                    moveTo(14f, 17f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(14f)
                    close()
                    moveTo(9.5f, 12f)
                    curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                    reflectiveCurveTo(6.5f, 12.83f, 6.5f, 12f)
                    reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                    reflectiveCurveTo(9.5f, 11.17f, 9.5f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Bento!!
    }

private var _Bento: ImageVector? = null

