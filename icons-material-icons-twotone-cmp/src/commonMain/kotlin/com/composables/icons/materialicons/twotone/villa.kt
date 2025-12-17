package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Villa: ImageVector
    get() {
        if (_Villa != null) return _Villa!!
        
        _Villa = ImageVector.Builder(
            name = "villa",
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 9.37f)
                lineToRelative(9f, -3.46f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineToRelative(7f)
                horizontalLineTo(5f)
                verticalLineTo(9.37f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                verticalLineTo(19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(3f)
                lineTo(3f, 8f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-9f)
                curveTo(21f, 10.9f, 20.1f, 10f, 19f, 10f)
                close()
                moveTo(5f, 9.37f)
                lineToRelative(9f, -3.46f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineToRelative(7f)
                horizontalLineTo(5f)
                verticalLineTo(9.37f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                verticalLineTo(19f)
                close()
            }
        }.build()
        
        return _Villa!!
    }

private var _Villa: ImageVector? = null

