package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Envelope: ImageVector
    get() {
        if (_Envelope != null) return _Envelope!!
        
        _Envelope = ImageVector.Builder(
            name = "envelope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 4.5f)
                verticalLineToRelative(0.793f)
                curveToRelative(0.026f, 0.009f, 0.051f, 0.02f, 0.076f, 0.032f)
                lineTo(7.674f, 8.51f)
                curveToRelative(0.206f, 0.1f, 0.446f, 0.1f, 0.652f, 0f)
                lineToRelative(6.598f, -3.185f)
                arcTo(0.755f, 0.755f, 0f, false, true, 15f, 5.293f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.5f, 3f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 6.954f)
                lineTo(8.978f, 9.86f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.956f, 0f)
                lineTo(1f, 6.954f)
                verticalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 13f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(6.954f)
                close()
            }
        }.build()
        
        return _Envelope!!
    }

private var _Envelope: ImageVector? = null

