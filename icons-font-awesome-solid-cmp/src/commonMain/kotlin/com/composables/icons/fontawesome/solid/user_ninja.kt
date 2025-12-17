package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserNinja: ImageVector
    get() {
        if (_UserNinja != null) return _UserNinja!!
        
        _UserNinja = ImageVector.Builder(
            name = "user-ninja",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(325.4f, 289.2f)
                lineTo(224f, 390.6f)
                lineTo(122.6f, 289.2f)
                curveTo(54f, 295.3f, 0f, 352.2f, 0f, 422.4f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineToRelative(-41.6f)
                curveToRelative(0f, -70.2f, -54f, -127.1f, -122.6f, -133.2f)
                close()
                moveTo(32f, 192f)
                curveToRelative(27.3f, 0f, 51.8f, -11.5f, 69.2f, -29.7f)
                curveToRelative(15.1f, 53.9f, 64f, 93.7f, 122.8f, 93.7f)
                curveToRelative(70.7f, 0f, 128f, -57.3f, 128f, -128f)
                reflectiveCurveTo(294.7f, 0f, 224f, 0f)
                curveToRelative(-50.4f, 0f, -93.6f, 29.4f, -114.5f, 71.8f)
                curveTo(92.1f, 47.8f, 64f, 32f, 32f, 32f)
                curveToRelative(0f, 33.4f, 17.1f, 62.8f, 43.1f, 80f)
                curveToRelative(-26f, 17.2f, -43.1f, 46.6f, -43.1f, 80f)
                close()
                moveToRelative(144f, -96f)
                horizontalLineToRelative(96f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                horizontalLineTo(144f)
                curveToRelative(0f, -17.7f, 14.3f, -32f, 32f, -32f)
                close()
            }
        }.build()
        
        return _UserNinja!!
    }

private var _UserNinja: ImageVector? = null

