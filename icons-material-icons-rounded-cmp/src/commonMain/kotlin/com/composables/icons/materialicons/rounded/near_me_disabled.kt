package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Near_me_disabled: ImageVector
    get() {
        if (_Near_me_disabled != null) return _Near_me_disabled!!
        
        _Near_me_disabled = ImageVector.Builder(
            name = "near_me_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6.34f)
                lineToRelative(6.95f, -2.58f)
                curveToRelative(0.8f, -0.3f, 1.58f, 0.48f, 1.29f, 1.29f)
                lineTo(17.66f, 12f)
                lineTo(12f, 6.34f)
                close()
                moveTo(21.9f, 19.07f)
                lineTo(4.93f, 2.1f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.36f, 4.36f)
                lineToRelative(-4.2f, 1.56f)
                curveTo(3.27f, 9.59f, 3f, 9.97f, 3f, 10.4f)
                curveToRelative(0f, 0.42f, 0.26f, 0.8f, 0.65f, 0.96f)
                lineToRelative(6.42f, 2.57f)
                lineToRelative(2.57f, 6.42f)
                curveTo(12.8f, 20.74f, 13.18f, 21f, 13.6f, 21f)
                curveToRelative(0.43f, 0f, 0.82f, -0.27f, 0.97f, -0.67f)
                lineToRelative(1.56f, -4.2f)
                lineToRelative(4.36f, 4.36f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveTo(22.29f, 20.09f, 22.29f, 19.46f, 21.9f, 19.07f)
                close()
            }
        }.build()
        
        return _Near_me_disabled!!
    }

private var _Near_me_disabled: ImageVector? = null

