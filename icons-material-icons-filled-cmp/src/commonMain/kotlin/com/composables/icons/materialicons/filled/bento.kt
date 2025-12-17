package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Bento: ImageVector
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
                    moveTo(16f, 11f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(4f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(16f)
                    close()
                    moveTo(20f, 19f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(-6f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(14f, 5f)
                    verticalLineToRelative(14f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineTo(14f)
                    close()
                    moveTo(9.5f, 12f)
                    curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                    reflectiveCurveTo(6.5f, 11.17f, 6.5f, 12f)
                    reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                    reflectiveCurveTo(9.5f, 12.83f, 9.5f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Bento!!
    }

private var _Bento: ImageVector? = null

