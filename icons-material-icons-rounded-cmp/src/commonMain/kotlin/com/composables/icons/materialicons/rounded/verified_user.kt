package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Verified_user: ImageVector
    get() {
        if (_Verified_user != null) return _Verified_user!!
        
        _Verified_user = ImageVector.Builder(
            name = "verified_user",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.19f, 1.36f)
                lineToRelative(-7f, 3.11f)
                curveTo(3.47f, 4.79f, 3f, 5.51f, 3f, 6.3f)
                verticalLineTo(11f)
                curveToRelative(0f, 5.55f, 3.84f, 10.74f, 9f, 12f)
                curveToRelative(5.16f, -1.26f, 9f, -6.45f, 9f, -12f)
                verticalLineTo(6.3f)
                curveToRelative(0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f)
                lineToRelative(-7f, -3.11f)
                curveToRelative(-0.51f, -0.23f, -1.11f, -0.23f, -1.62f, 0f)
                close()
                moveToRelative(-1.9f, 14.93f)
                lineTo(6.7f, 13.7f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineTo(10f, 14.17f)
                lineToRelative(5.88f, -5.88f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-6.59f, 6.59f)
                curveToRelative(-0.38f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                close()
            }
        }.build()
        
        return _Verified_user!!
    }

private var _Verified_user: ImageVector? = null

