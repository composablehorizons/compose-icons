package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Voicemail: ImageVector
    get() {
        if (_Voicemail != null) return _Voicemail!!
        
        _Voicemail = ImageVector.Builder(
            name = "voicemail",
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
                moveTo(18.5f, 6f)
                curveTo(15.46f, 6f, 13f, 8.46f, 13f, 11.5f)
                curveToRelative(0f, 1.33f, 0.47f, 2.55f, 1.26f, 3.5f)
                horizontalLineTo(9.74f)
                curveToRelative(0.79f, -0.95f, 1.26f, -2.17f, 1.26f, -3.5f)
                curveTo(11f, 8.46f, 8.54f, 6f, 5.5f, 6f)
                reflectiveCurveTo(0f, 8.46f, 0f, 11.5f)
                reflectiveCurveTo(2.46f, 17f, 5.5f, 17f)
                horizontalLineToRelative(13f)
                curveToRelative(3.04f, 0f, 5.5f, -2.46f, 5.5f, -5.5f)
                reflectiveCurveTo(21.54f, 6f, 18.5f, 6f)
                close()
                moveToRelative(-13f, 9f)
                curveTo(3.57f, 15f, 2f, 13.43f, 2f, 11.5f)
                reflectiveCurveTo(3.57f, 8f, 5.5f, 8f)
                reflectiveCurveTo(9f, 9.57f, 9f, 11.5f)
                reflectiveCurveTo(7.43f, 15f, 5.5f, 15f)
                close()
                moveToRelative(13f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveTo(16.57f, 8f, 18.5f, 8f)
                reflectiveCurveTo(22f, 9.57f, 22f, 11.5f)
                reflectiveCurveTo(20.43f, 15f, 18.5f, 15f)
                close()
            }
        }.build()
        
        return _Voicemail!!
    }

private var _Voicemail: ImageVector? = null

