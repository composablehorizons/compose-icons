package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Suitcase: ImageVector
    get() {
        if (_Suitcase != null) return _Suitcase!!
        
        _Suitcase = ImageVector.Builder(
            name = "suitcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 480f)
                horizontalLineToRelative(256f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                horizontalLineTo(176f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(64f, -384f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(32f)
                horizontalLineTo(192f)
                verticalLineTo(96f)
                close()
                moveToRelative(320f, 80f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineToRelative(-48f)
                verticalLineTo(128f)
                horizontalLineToRelative(48f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveTo(96f, 480f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(176f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(352f)
                close()
            }
        }.build()
        
        return _Suitcase!!
    }

private var _Suitcase: ImageVector? = null

