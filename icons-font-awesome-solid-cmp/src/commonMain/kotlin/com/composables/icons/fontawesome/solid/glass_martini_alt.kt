package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GlassMartiniAlt: ImageVector
    get() {
        if (_GlassMartiniAlt != null) return _GlassMartiniAlt!!
        
        _GlassMartiniAlt = ImageVector.Builder(
            name = "glass-martini-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(502.05f, 57.6f)
                curveTo(523.3f, 36.34f, 508.25f, 0f, 478.2f, 0f)
                horizontalLineTo(33.8f)
                curveTo(3.75f, 0f, -11.3f, 36.34f, 9.95f, 57.6f)
                lineTo(224f, 271.64f)
                verticalLineTo(464f)
                horizontalLineToRelative(-56f)
                curveToRelative(-22.09f, 0f, -40f, 17.91f, -40f, 40f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                horizontalLineToRelative(240f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                curveToRelative(0f, -22.09f, -17.91f, -40f, -40f, -40f)
                horizontalLineToRelative(-56f)
                verticalLineTo(271.64f)
                lineTo(502.05f, 57.6f)
                close()
                moveTo(443.77f, 48f)
                lineToRelative(-48f, 48f)
                horizontalLineTo(116.24f)
                lineToRelative(-48f, -48f)
                horizontalLineToRelative(375.53f)
                close()
            }
        }.build()
        
        return _GlassMartiniAlt!!
    }

private var _GlassMartiniAlt: ImageVector? = null

