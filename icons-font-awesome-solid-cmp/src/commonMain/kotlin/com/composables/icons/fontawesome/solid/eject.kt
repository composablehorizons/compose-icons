package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Eject: ImageVector
    get() {
        if (_Eject != null) return _Eject!!
        
        _Eject = ImageVector.Builder(
            name = "eject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 384f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.673f, -14.327f, 32f, -32f, 32f)
                horizontalLineTo(32f)
                curveToRelative(-17.673f, 0f, -32f, -14.327f, -32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.673f, 14.327f, -32f, 32f, -32f)
                horizontalLineToRelative(384f)
                curveToRelative(17.673f, 0f, 32f, 14.327f, 32f, 32f)
                close()
                moveTo(48.053f, 320f)
                horizontalLineToRelative(351.886f)
                curveToRelative(41.651f, 0f, 63.581f, -49.674f, 35.383f, -80.435f)
                lineTo(259.383f, 47.558f)
                curveToRelative(-19.014f, -20.743f, -51.751f, -20.744f, -70.767f, 0f)
                lineTo(12.67f, 239.565f)
                curveTo(-15.475f, 270.268f, 6.324f, 320f, 48.053f, 320f)
                close()
            }
        }.build()
        
        return _Eject!!
    }

private var _Eject: ImageVector? = null

