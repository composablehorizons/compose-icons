package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.FacebookSquare: ImageVector
    get() {
        if (_FacebookSquare != null) return _FacebookSquare!!
        
        _FacebookSquare = ImageVector.Builder(
            name = "facebook-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                arcTo(48f, 48f, 0f, false, false, 0f, 80f)
                verticalLineToRelative(352f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, 48f)
                horizontalLineToRelative(137.25f)
                verticalLineTo(327.69f)
                horizontalLineToRelative(-63f)
                verticalLineTo(256f)
                horizontalLineToRelative(63f)
                verticalLineToRelative(-54.64f)
                curveToRelative(0f, -62.15f, 37f, -96.48f, 93.67f, -96.48f)
                curveToRelative(27.14f, 0f, 55.52f, 4.84f, 55.52f, 4.84f)
                verticalLineToRelative(61f)
                horizontalLineToRelative(-31.27f)
                curveToRelative(-30.81f, 0f, -40.42f, 19.12f, -40.42f, 38.73f)
                verticalLineTo(256f)
                horizontalLineToRelative(68.78f)
                lineToRelative(-11f, 71.69f)
                horizontalLineToRelative(-57.78f)
                verticalLineTo(480f)
                horizontalLineTo(400f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, -48f)
                verticalLineTo(80f)
                arcToRelative(48f, 48f, 0f, false, false, -48f, -48f)
                close()
            }
        }.build()
        
        return _FacebookSquare!!
    }

private var _FacebookSquare: ImageVector? = null

