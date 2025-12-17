package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Flight: ImageVector
    get() {
        if (_Flight != null) return _Flight!!
        
        _Flight = ImageVector.Builder(
            name = "flight",
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
                moveTo(10f, 19f)
                lineToRelative(-2f, 1.5f)
                verticalLineTo(22f)
                lineToRelative(3.5f, -1f)
                lineToRelative(3.5f, 1f)
                verticalLineToRelative(-1.5f)
                lineTo(13f, 19f)
                verticalLineToRelative(-5.5f)
                lineToRelative(8f, 2.5f)
                verticalLineToRelative(-2f)
                lineToRelative(-8f, -5f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(10f, 2.67f, 10f, 3.5f)
                verticalLineTo(9f)
                lineToRelative(-8f, 5f)
                verticalLineToRelative(2f)
                lineToRelative(8f, -2.5f)
                verticalLineTo(19f)
                close()
            }
        }.build()
        
        return _Flight!!
    }

private var _Flight: ImageVector? = null

