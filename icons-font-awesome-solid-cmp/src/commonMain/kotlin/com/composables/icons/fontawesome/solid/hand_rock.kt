package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandRock: ImageVector
    get() {
        if (_HandRock != null) return _HandRock!!
        
        _HandRock = ImageVector.Builder(
            name = "hand-rock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464.8f, 80f)
                curveToRelative(-26.9f, -0.4f, -48.8f, 21.2f, -48.8f, 48f)
                horizontalLineToRelative(-8f)
                verticalLineTo(96.8f)
                curveToRelative(0f, -26.3f, -20.9f, -48.3f, -47.2f, -48.8f)
                curveToRelative(-26.9f, -0.4f, -48.8f, 21.2f, -48.8f, 48f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-8f)
                verticalLineTo(80.8f)
                curveToRelative(0f, -26.3f, -20.9f, -48.3f, -47.2f, -48.8f)
                curveToRelative(-26.9f, -0.4f, -48.8f, 21.2f, -48.8f, 48f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-8f)
                verticalLineTo(96.8f)
                curveToRelative(0f, -26.3f, -20.9f, -48.3f, -47.2f, -48.8f)
                curveToRelative(-26.9f, -0.4f, -48.8f, 21.2f, -48.8f, 48f)
                verticalLineToRelative(136f)
                lineToRelative(-8f, -7.1f)
                verticalLineToRelative(-48.1f)
                curveToRelative(0f, -26.3f, -20.9f, -48.3f, -47.2f, -48.8f)
                curveTo(21.9f, 127.6f, 0f, 149.2f, 0f, 176f)
                verticalLineToRelative(66.4f)
                curveToRelative(0f, 27.4f, 11.7f, 53.5f, 32.2f, 71.8f)
                lineToRelative(111.7f, 99.3f)
                curveToRelative(10.2f, 9.1f, 16.1f, 22.2f, 16.1f, 35.9f)
                verticalLineToRelative(6.7f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(240f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineToRelative(-2.9f)
                curveToRelative(0f, -12.8f, 2.6f, -25.5f, 7.5f, -37.3f)
                lineToRelative(49f, -116.3f)
                curveToRelative(5f, -11.8f, 7.5f, -24.5f, 7.5f, -37.3f)
                verticalLineTo(128.8f)
                curveToRelative(0f, -26.3f, -20.9f, -48.4f, -47.2f, -48.8f)
                close()
            }
        }.build()
        
        return _HandRock!!
    }

private var _HandRock: ImageVector? = null

