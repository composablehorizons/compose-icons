package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.RulerHorizontal: ImageVector
    get() {
        if (_RulerHorizontal != null) return _RulerHorizontal!!
        
        _RulerHorizontal = ImageVector.Builder(
            name = "ruler-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(544f, 128f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(88f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(88f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(88f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(88f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(88f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineTo(88f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-88f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(512f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(160f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _RulerHorizontal!!
    }

private var _RulerHorizontal: ImageVector? = null

