package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Exposure: ImageVector
    get() {
        if (_Exposure != null) return _Exposure!!
        
        _Exposure = ImageVector.Builder(
            name = "exposure",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-1.41f, 2f)
                lineTo(5f, 17.59f)
                verticalLineTo(5f)
                horizontalLineToRelative(12.59f)
                close()
                moveTo(6.41f, 19f)
                lineTo(19f, 6.41f)
                verticalLineTo(19f)
                horizontalLineTo(6.41f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(6f)
                close()
                moveToRelative(10f, 5.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Exposure!!
    }

private var _Exposure: ImageVector? = null

