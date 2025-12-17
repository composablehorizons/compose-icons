package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Couch: ImageVector
    get() {
        if (_Couch != null) return _Couch!!
        
        _Couch = ImageVector.Builder(
            name = "couch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 224f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -35.3f, 28.7f, -64f, 64f, -64f)
                horizontalLineToRelative(32f)
                curveToRelative(0f, -53f, -43f, -96f, -96f, -96f)
                horizontalLineTo(160f)
                curveToRelative(-53f, 0f, -96f, 43f, -96f, 96f)
                horizontalLineToRelative(32f)
                curveToRelative(35.3f, 0f, 64f, 28.7f, 64f, 64f)
                close()
                moveToRelative(416f, -32f)
                horizontalLineToRelative(-32f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(96f)
                horizontalLineTo(128f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                horizontalLineTo(64f)
                curveToRelative(-35.3f, 0f, -64f, 28.7f, -64f, 64f)
                curveToRelative(0f, 23.6f, 13f, 44f, 32f, 55.1f)
                verticalLineTo(432f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(384f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(311.1f)
                curveToRelative(19f, -11.1f, 32f, -31.5f, 32f, -55.1f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                close()
            }
        }.build()
        
        return _Couch!!
    }

private var _Couch: ImageVector? = null

