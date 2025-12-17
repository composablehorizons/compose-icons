package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Virus: ImageVector
    get() {
        if (_Virus != null) return _Virus!!
        
        _Virus = ImageVector.Builder(
            name = "virus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(483.55f, 227.55f)
                horizontalLineTo(462f)
                curveToRelative(-50.68f, 0f, -76.07f, -61.27f, -40.23f, -97.11f)
                lineTo(437f, 115.19f)
                arcTo(28.44f, 28.44f, 0f, false, false, 396.8f, 75f)
                lineTo(381.56f, 90.22f)
                curveToRelative(-35.84f, 35.83f, -97.11f, 10.45f, -97.11f, -40.23f)
                verticalLineTo(28.44f)
                arcToRelative(28.45f, 28.45f, 0f, false, false, -56.9f, 0f)
                verticalLineTo(50f)
                curveToRelative(0f, 50.68f, -61.27f, 76.06f, -97.11f, 40.23f)
                lineTo(115.2f, 75f)
                arcTo(28.44f, 28.44f, 0f, false, false, 75f, 115.19f)
                lineToRelative(15.25f, 15.25f)
                curveToRelative(35.84f, 35.84f, 10.45f, 97.11f, -40.23f, 97.11f)
                horizontalLineTo(28.45f)
                arcToRelative(28.45f, 28.45f, 0f, true, false, 0f, 56.89f)
                horizontalLineTo(50f)
                curveToRelative(50.68f, 0f, 76.07f, 61.28f, 40.23f, 97.12f)
                lineTo(75f, 396.8f)
                arcTo(28.45f, 28.45f, 0f, false, false, 115.2f, 437f)
                lineToRelative(15.24f, -15.25f)
                curveToRelative(35.84f, -35.84f, 97.11f, -10.45f, 97.11f, 40.23f)
                verticalLineToRelative(21.54f)
                arcToRelative(28.45f, 28.45f, 0f, false, false, 56.9f, 0f)
                verticalLineTo(462f)
                curveToRelative(0f, -50.68f, 61.27f, -76.07f, 97.11f, -40.23f)
                lineTo(396.8f, 437f)
                arcTo(28.45f, 28.45f, 0f, false, false, 437f, 396.8f)
                lineToRelative(-15.25f, -15.24f)
                curveToRelative(-35.84f, -35.84f, -10.45f, -97.12f, 40.23f, -97.12f)
                horizontalLineToRelative(21.54f)
                arcToRelative(28.45f, 28.45f, 0f, true, false, 0f, -56.89f)
                close()
                moveTo(224f, 272f)
                arcToRelative(48f, 48f, 0f, true, true, 48f, -48f)
                arcTo(48f, 48f, 0f, false, true, 224f, 272f)
                close()
                moveToRelative(80f, 56f)
                arcToRelative(24f, 24f, 0f, true, true, 24f, -24f)
                arcTo(24f, 24f, 0f, false, true, 304f, 328f)
                close()
            }
        }.build()
        
        return _Virus!!
    }

private var _Virus: ImageVector? = null

