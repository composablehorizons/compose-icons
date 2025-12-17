package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Dialer_sip: ImageVector
    get() {
        if (_Dialer_sip != null) return _Dialer_sip!!
        
        _Dialer_sip = ImageVector.Builder(
            name = "dialer_sip",
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
                moveTo(17f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                close()
                moveToRelative(3f, -2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(2f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(0f, 10.5f)
                curveToRelative(-1.25f, 0f, -2.45f, -0.2f, -3.57f, -0.57f)
                curveToRelative(-0.35f, -0.11f, -0.74f, -0.03f, -1.01f, 0.24f)
                lineToRelative(-2.2f, 2.2f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(2.2f, -2.21f)
                curveToRelative(0.27f, -0.26f, 0.35f, -0.65f, 0.24f, -1f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 9.39f, 7.61f, 17f, 17f, 17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.build()
        
        return _Dialer_sip!!
    }

private var _Dialer_sip: ImageVector? = null

