package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bible: ImageVector
    get() {
        if (_Bible != null) return _Bible!!
        
        _Bible = ImageVector.Builder(
            name = "bible",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 358.4f)
                verticalLineTo(25.6f)
                curveToRelative(0f, -16f, -9.6f, -25.6f, -25.6f, -25.6f)
                horizontalLineTo(96f)
                curveTo(41.6f, 0f, 0f, 41.6f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 54.4f, 41.6f, 96f, 96f, 96f)
                horizontalLineToRelative(326.4f)
                curveToRelative(12.8f, 0f, 25.6f, -9.6f, 25.6f, -25.6f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -6.4f, -3.2f, -12.8f, -9.6f, -19.2f)
                curveToRelative(-3.2f, -16f, -3.2f, -60.8f, 0f, -73.6f)
                curveToRelative(6.4f, -3.2f, 9.6f, -9.6f, 9.6f, -19.2f)
                close()
                moveTo(144f, 144f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(48f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(48f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineTo(192f)
                horizontalLineToRelative(-48f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-32f)
                close()
                moveToRelative(236.8f, 304f)
                horizontalLineTo(96f)
                curveToRelative(-19.2f, 0f, -32f, -12.8f, -32f, -32f)
                reflectiveCurveToRelative(16f, -32f, 32f, -32f)
                horizontalLineToRelative(284.8f)
                verticalLineToRelative(64f)
                close()
            }
        }.build()
        
        return _Bible!!
    }

private var _Bible: ImageVector? = null

