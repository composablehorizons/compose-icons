package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Flare: ImageVector
    get() {
        if (_Flare != null) return _Flare!!
        
        _Flare = ImageVector.Builder(
            name = "flare",
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 11f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(2.17f, -3.24f)
                lineTo(7.05f, 5.64f)
                lineTo(5.64f, 7.05f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(13f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                close()
                moveToRelative(5.36f, 6.05f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(17f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(-5f, -2f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
                moveToRelative(2.83f, 7.24f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveToRelative(-9.19f, 0.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(11f, 23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Flare!!
    }

private var _Flare: ImageVector? = null

