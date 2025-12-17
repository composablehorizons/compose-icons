package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Phone_disabled: ImageVector
    get() {
        if (_Phone_disabled != null) return _Phone_disabled!!
        
        _Phone_disabled = ImageVector.Builder(
            name = "phone_disabled",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.34f, 14.54f)
                lineToRelative(-1.43f, -1.43f)
                curveToRelative(0.56f, -0.73f, 1.05f, -1.5f, 1.47f, -2.32f)
                lineToRelative(-2.2f, -2.2f)
                curveToRelative(-0.28f, -0.28f, -0.36f, -0.67f, -0.25f, -1.02f)
                curveToRelative(0.37f, -1.12f, 0.57f, -2.32f, 0.57f, -3.57f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineTo(20f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 3.98f, -1.37f, 7.64f, -3.66f, 10.54f)
                close()
                moveToRelative(-2.82f, 2.81f)
                curveTo(11.63f, 19.64f, 7.97f, 21f, 4f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.49f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(1.24f, 0f, 2.45f, -0.2f, 3.57f, -0.57f)
                curveToRelative(0.35f, -0.12f, 0.75f, -0.03f, 1.02f, 0.24f)
                lineToRelative(2.2f, 2.2f)
                curveToRelative(0.81f, -0.42f, 1.58f, -0.9f, 2.3f, -1.46f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.42f, -1.41f)
                lineTo(21.19f, 21.2f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-5.26f, -5.26f)
                close()
            }
        }.build()
        
        return _Phone_disabled!!
    }

private var _Phone_disabled: ImageVector? = null

