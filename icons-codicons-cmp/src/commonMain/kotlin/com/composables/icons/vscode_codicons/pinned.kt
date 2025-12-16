package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Pinned: ImageVector
    get() {
        if (_Pinned != null) return _Pinned!!
        
        _Pinned = ImageVector.Builder(
            name = "pinned",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.0589f, 2.44511f)
                curveTo(9.34701f, 1.73063f, 8.14697f, 1.90829f, 7.67261f, 2.79839f)
                lineTo(5.6526f, 6.58878f)
                lineTo(2.8419f, 7.52568f)
                curveTo(2.6775f, 7.58048f, 2.5532f, 7.71649f, 2.51339f, 7.88514f)
                curveTo(2.47357f, 8.0538f, 2.52392f, 8.23104f, 2.64646f, 8.35357f)
                lineTo(4.79291f, 10.5f)
                lineTo(2.14645f, 13.1465f)
                lineTo(2f, 14f)
                lineTo(2.85356f, 13.8536f)
                lineTo(5.50002f, 11.2071f)
                lineTo(7.64646f, 13.3536f)
                curveTo(7.76899f, 13.4761f, 7.94623f, 13.5265f, 8.11489f, 13.4866f)
                curveTo(8.28354f, 13.4468f, 8.41955f, 13.3225f, 8.47435f, 13.1581f)
                lineTo(9.41143f, 10.3469f)
                lineTo(13.1897f, 8.32423f)
                curveTo(14.0759f, 7.84982f, 14.2538f, 6.6551f, 13.5443f, 5.94305f)
                lineTo(10.0589f, 2.44511f)
                close()
                moveTo(8.55511f, 3.2687f)
                curveTo(8.71323f, 2.972f, 9.11324f, 2.91278f, 9.35055f, 3.15094f)
                lineTo(12.836f, 6.64889f)
                curveTo(13.0725f, 6.88624f, 13.0131f, 7.28448f, 12.7178f, 7.44262f)
                lineTo(8.76403f, 9.55921f)
                curveTo(8.65137f, 9.61952f, 8.56608f, 9.72068f, 8.52567f, 9.84191f)
                lineTo(7.7815f, 12.0744f)
                lineTo(3.92562f, 8.21853f)
                lineTo(6.15812f, 7.47436f)
                curveTo(6.27966f, 7.43385f, 6.38101f, 7.34823f, 6.44126f, 7.23518f)
                lineTo(8.55511f, 3.2687f)
                close()
            }
        }.build()
        
        return _Pinned!!
    }

private var _Pinned: ImageVector? = null

